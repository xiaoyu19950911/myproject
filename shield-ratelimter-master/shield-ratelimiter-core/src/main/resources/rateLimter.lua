--获取KEY
local key1 = KEYS[1]

--value+1
local val = redis.call('incr', key1)
--获取key剩余时间
local ttl = redis.call('ttl', key1)

--获取ARGV内的参数并打印（超时时间和阀值）
local expire = ARGV[1]
local times = ARGV[2]

redis.log(redis.LOG_DEBUG,tostring(times))
redis.log(redis.LOG_DEBUG,tostring(expire))

redis.log(redis.LOG_NOTICE, "incr "..key1.." "..val);
if val == 1 then
    redis.call('expire', key1, tonumber(expire))
else
    if ttl == -1 then
        redis.call('expire', key1, tonumber(expire))
    end
end

if val > tonumber(times) then
    return 0
end

return 1