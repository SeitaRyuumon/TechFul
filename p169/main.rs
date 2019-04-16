fn get_line() -> String{
	let mut __ret=String::new();
	std::io::stdin().read_line(&mut __ret).ok();
	return __ret;
}
fn get_i64() -> i64{
	get_line().trim_end().to_owned().parse::<i64>().unwrap()
}
fn loop_input(mut __v: Vec<i64>) -> Vec<i64> {
	__v.push(get_i64());
	return __v
}
fn main(){
	let mut __num: i64;
	println!("start:");
	__num = get_i64();
	println!("num: {}",__num);

	let mut v: Vec<i64> = vec![];
	v = loop_input(v);
	for i in 0..__num {
		println!("{} :{}",i as usize,v[i as usize]);
	}
}
